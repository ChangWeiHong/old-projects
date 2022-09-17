<!DOCTYPE html>
<html>
<head>
	<title>Softinn</title>
</head>
<body>
	<h1>Subcriptions Form</h1>
	<form role="form" method="post" action="submit.php"> 
		<label for="firstName">First Name:</label> <br>
		<input type="text" name="firstName" id="firstName" placeholder="First Name"/>
		<br><br>
		<label for="subscriptionPlan">Last Name:</label> <br>
		<input type="text" name="lastName" id="lastName" placeholder="Last Name"/>
		<br><br>

		<label for="email">Email:</label> <br>
		<input type="text" name="email" id="email" placeholder="Last Name"/>
		<br><br>

		<label for="subscriptionPlan">Subscription Plan:</label> 
			<br>
		<radiogroup>
			<input type="radio" id="basic" name="subscriptionPlan" value="Basic">
			<label for="male">Basic</label><br>
			<input type="radio" id="premium" name="subscriptionPlan" value="Premium">
			<label for="Premium">Premium</label><br>
		</radiogroup><br>
    	<button type="submit">Submit</button>
    </form>
</body>
</html>


