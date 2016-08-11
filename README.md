[![SI7050](SI7050_I2CS.png)](https://www.controleverything.com/content/Temperature?sku=SI7050_I2CS)
# SI7050
SI7050 Temperature Sensor

The SI7050 is a fully integrated Temperature Sensor.

This Device is available from ControlEverything.com [SKU: SI7050_I2CS]

https://www.controleverything.com/content/Temperature?sku=SI7050_I2CS

This Sample code can be used with Raspberry pi and Arduino.

## Java
Download and install pi4j library on Raspberry pi. Steps to install pi4j are provided at:

http://pi4j.com/install.html

Download (or git pull) the code in pi.

Compile the java program.
```cpp
$> pi4j SI7050.java
```

Run the java program.
```cpp
$> pi4j SI7050
```

## Python
Download and install smbus library on Raspberry pi. Steps to install smbus are provided at:

https://pypi.python.org/pypi/smbus-cffi/0.5.1

Download (or git pull) the code in pi. Run the program.

```cpp
$> python SI7050.py
```

## Arduino
Download and install Arduino Software (IDE) on your machine. Steps to install Arduino are provided at:

https://www.arduino.cc/en/Main/Software

Download (or git pull) the code and double click the file to run the program.

Compile and upload the code on Arduino IDE and see the output on Serial Monitor.

## C

Setup your BeagleBone Black according to steps provided at:

https://beagleboard.org/getting-started

Download (or git pull) the code in Beaglebone Black.

Compile the c program.
```cpp
$>gcc SI7050.c -o SI7050
```
Run the c program.
```cpp
$>./SI7050
```

## Onion Omega

Get Started and setting up the Onion Omega according to steps provided at :

https://wiki.onion.io/Get-Started

To install the Python module, run the following commands:
```cpp
opkg update
```
```cpp
opkg install python-light pyOnionI2C
```

Download (or git pull) the code in Onion Omega. Run the program.

```cpp
$> python SI7050.py
```
#####The code output is the temperature reading in degree celsius and fahrenheit.
