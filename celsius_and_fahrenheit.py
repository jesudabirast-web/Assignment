def temperature_value(number):
	f = temperature_to_fahrenheit
	c = temperature_to_celsius

	temperature_to_celsius = (f - 32) * 5 / 9
	temperature_to_fahrenheit = (C * 9 / 5) + 32
	threshold_value = 32

	if temperature_to_celsius > user_threshold & temperature_to_fahrenheit < threshold_value:
		return "above threshold"

	if temperature_to_fahrenheit < user_threshold & temperature_to_celsius > threshold_value:
		return "below threshold"

	if temperature_to_celsius & temperature_to_fahrenheit >= threshold_value:
		return "Heat alert"
	
	if temperature_to_celsius & temperature_to_fahrenheit <= threshold_value:
		return "Cold advisory"

print(temperature_value(34))