package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.Broker;
import no.hvl.dat110.broker.Dispatcher;
import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.PublishMsg;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sensor = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		Client client = new Client("sensor", Common.BROKERHOST ,Common.BROKERPORT);
		client.connect();

		// - publish the temperature(s)
		client.createTopic(Common.TEMPTOPIC);
		for (int i = 0; i < COUNT; i++) {
			client.publish(Common.TEMPTOPIC, String.valueOf(sensor.read()));
		}
		// - disconnect from the broker
		System.out.println("Temperature device stopping ... ");
		client.disconnect();

	}
}
