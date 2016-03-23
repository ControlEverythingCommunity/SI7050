// Distributed with a free-will license.
// Use it any way you want, profit or free, provided it fits in the licenses of its associated works.
// SI7050
// This code is designed to work with the SI7050_I2CS I2C Mini Module available from ControlEverything.com.
// https://www.controleverything.com/content/Temperature?sku=SI7050_I2CS#tabs-0-product_tabset-2

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;

public class SI7050
{
	public static void main(String args[]) throws Exception
	{
		// Create I2C bus
		I2CBus Bus = I2CFactory.getInstance(I2CBus.BUS_1);
		// Get I2C device, SI7050 I2C address is 0x40(64)
		I2CDevice device = Bus.getDevice(0x40);

		// Send temperature measurement command, NO HOLD MASTER
		device.write((byte)0xF3);
		Thread.sleep(500);

		// Read 2 bytes of temperature data
		// temp msb, temp lsb
		byte[] data = new byte[2];
		device.read(data, 0, 2);

		// Convert the data
		double cTemp = (((((data[0] & 0xFF) * 256) + (data[1] & 0xFF)) * 175.72) / 65536.0) - 46.85;
		double fTemp = cTemp * 1.8 + 32;

		// Output data to screen
		System.out.printf("Temperature in Celsius : %.2f C %n", cTemp);
		System.out.printf("Temperature in Fahrenheit : %.2f F %n", fTemp);
	}
}
