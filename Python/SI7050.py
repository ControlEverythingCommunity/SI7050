# Distributed with a free-will license.
# Use it any way you want, profit or free, provided it fits in the licenses of its associated works.
# SI7050
# This code is designed to work with the SI7050_I2CS I2C Mini Module available from ControlEverything.com.
# https://www.controleverything.com/content/Temperature?sku=SI7050_I2CS#tabs-0-product_tabset-2

import smbus
import time

# Get I2C bus
bus = smbus.SMBus(1)

# SI7050 address, 0x40(64) 
#   0xF3(243) Select temperature NO HOLD MASTER mode
bus.write_byte(0x40, 0xF3)

time.sleep(0.5)

# SI7050 address, 0x40(64)
# Read data back, 2 bytes, MSB first
data0 = bus.read_byte(0x40)
data1 = bus.read_byte(0x40)

# Convert the data
cTemp = (175.72 * (data0 * 256.0 + data1) / 65536.0) - 46.85
fTemp = cTemp * 1.8 + 32

# Output data to screen
print "Temperature in Celsius : %.2f C" %cTemp
print "Temperature in Fahrenheit : %.2f F" %fTemp
