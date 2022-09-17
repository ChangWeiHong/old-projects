<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<?php

$host = "localhost:3308";
$userName = "root";
$password = "";
$dbName = "softinn";
$conn = new mysqli($host, $userName, $password, $dbName);
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
$firstName = $_POST['firstName'];
$lastName = $_POST['lastName'];
$email = $_POST['email'];
$subscriptionPlan = $_POST['subscriptionPlan'];

$sql= "INSERT INTO user_subscription ( firstName, lastName, email, subscriptionPlan)VALUES ( '$firstName', '$lastName', '$email' , '$subscriptionPlan')";
mysqli_query($conn, $sql);
$conn->close();?>

<br>
Your First & Last Name is: <?php echo $_POST["firstName"]; ?>  <?php echo $_POST["lastName"]; ?><br>
Your email address is: <?php echo $_POST["email"]; ?><br>
Your subscription plan is: <?php echo $_POST["subscriptionPlan"]; ?>

</body>
</html>