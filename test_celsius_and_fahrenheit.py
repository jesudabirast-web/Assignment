import unittest
import celsius_and_fahrenheit

class TestToConvertFromCelsiusToFahrenheit(unittest.TestCase):
	
	def test_that_it_converts_from_celsius_to_fahrenheit(self):
		celsius_and_fahrenheit.temperature_value(34)

	def test_that_it_converts_from_celsius_to_fahrenheit(self):
		actual = celsius_and_fahrenheit.temperature_value(34)
		expected = "above threshold"
		self.assertEqual(actual,expected)