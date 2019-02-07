package project.foodorder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.foodorder.AplicationSession;
import project.foodorder.utils.Serializer;

public class FileDataBase implements DataBase, Serializable {
	private static final long serialVersionUID = 1L;

	private List<User> users = new ArrayList<User>();

	@Override
	public List<User> getUser() {
		return users;
	}

	@Override
	public void addUser(User user) {
		users.add(user);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}

	@Override
	public User getReadingByName(String name) {
		for (User user : users) {
			if (user.hasName(name)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void editUser(String newname, String name) {
		User user = getReadingByName(name);
		user.edit(newname);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);

	}

	private List<AvailableOption> options = new ArrayList<AvailableOption>();

	@Override
	public List<AvailableOption> getOption() {
		return options;
	}

	@Override
	public void addOption(AvailableOption option) {
		options.add(option);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}

	@Override
	public AvailableOption getReadingByOptionID(String id) {
		for (AvailableOption option : options) {
			if (option.hasID(id)) {
				return option;
			}
		}
		return null;

	}

	@Override
	public void editOrderOption(String id, String details, double price) {
		AvailableOption option = getReadingByOptionID(id);
		option.edit(price, details);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}

	@Override
	public void deleteUser(String name) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.hasName(name)) {
				iterator.remove();
			}
		}

		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}

	@Override
	public void deleteOption(String id) {
		Iterator<AvailableOption> iterator = options.iterator();
		while (iterator.hasNext()) {
			AvailableOption option = iterator.next();
			if (option.hasID(id)) {
				iterator.remove();
			}
		}
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);

	}

	private List<Order> orders = new ArrayList<Order>();

	@Override
	public List<Order> getOrder() {
		return orders;
	}

	@Override
	public void addOrder(Order order) {
		orders.add(order);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}

	@Override
	public Order getOrderByName(String name) {
		for (Order order : orders) {
			if (order.hasOrderName(name)) {
				return order;
			}
	}
		return null;
	}

	@Override
	public void deleteOrder(String name) {
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			if (order.hasOrderName(name)) {
				iterator.remove();
			}
		
	}
	}

	@Override
	public void editOrderStatus(String orderName, boolean status, double money) {
		Order order = getOrderByName(orderName);
		order.edit(status, money);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
		
		
	}

}