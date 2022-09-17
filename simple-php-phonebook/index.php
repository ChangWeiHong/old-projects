<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">

		body{
			font-family: 'Poppins',sans-serif;
			font-weight: 400;
			line-height: 1.4;
			color: #fff;
		}

		body::before {
			content: '';
			position: fixed;
			top: 0;
			left: 0;
			height: 100%;
			width: 100%;
			z-index: -1;
			background: #1b1b32;
			background-image: linear-gradient(
				270deg,
				rgba(70,70,70,0.6),
				rgba(0,0,0,0.5)
				);
		}
		h3, h5 {
			font-weight: 400;
			line-height: 1.2;
		}
		label {
			display: flex;
			align-items: center;
			font-size: 1.2rem;
			margin-bottom: .2rem;
			padding-top: 1rem;

		}
		input[type=text],input[type=number] , select{
			border: 1px solid #ccc;
			border-radius: 2px;
			box-sizing: border-box;
		}

		header{
			text-align: center;
		}

		form{
			margin: 2.5rem;
			max-width: 30%
			padding: 2.5rem 0.625rem;
			border-radius: 0.25rem;
		}


		.form-group{
			font-size: 1.2rem;


		}

		table, th, td{
			border-collapse: collapse;
			border: .1rem solid #ddd;
			padding: .3rem;
			text-align: center;
		}

		.form-group{
			display: block;
			width: 100%;
			padding: 0.375rem 0.75rem;
			height: 4rem;
			background-clip: padding-box;
			transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
		}


		.btn{
			border: none;
			color: inherit;
			width: 30%;
			padding: 0.75rem;
			text-align: center;
			text-decoration: none;
			display: block;
			font-size: 16px;
			margin: 4px 2px;
			transition-duration: 0.4s;
			cursor: pointer;
			background-color: grey; 
			color: white; 
			margin-top: 1rem;
		}

		.btn:hover{
			background: green;  
			color: white;		
		}


	</style>

</head>
<body>

	<header>
		<h3>JUNIOR WEB DEVELOPER TEST CODING</h3>
		<h5>Name: Chang Wei Hong <br> Date: 20 Aug 2020</h5>
	</header>

	<hr>
	<main>
		<form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>" name="addNewNum">
			<div class="form-group">
				<label for="fname">First Name</label>
				<input type="text" name="fname" placeholder="You First Name">
			</div>

			<div class="form-group">
				<label for="lname">Last Name</label>
				<input type="text" name="lname" placeholder="Your Last Name">
			</div>


			<div class="form-group">
				<label for="phonetype">Phone Type</label>
				<select id="dropdown" name="phonetype">
					<option disabled selected value>Choose Phone Type</option>
					<option value="Home">Home</option>
					<option value="Work">Work</option>
					<option value="Cellular">Cellular</option>
					<option value="Other">Other</option>
				</select>
			</div>

			<div class="form-group">
				<label for="pnumber">Number</label>
				<input type="number" name="pnumber" placeholder="Your Phone Number">
			</div>

			<input type="submit" class="btn" name="Submit" href="index.php"/>
		</form>
		<hr>
		<?php
		$host = "localhost:3308";
		$userName = "root";
		$password = "";
		$dbName = "phonebook";
		$conn = new mysqli($host, $userName, $password, $dbName);
		if ($conn->connect_error) {
			die("Connection failed: " . $conn->connect_error);
		}

		$query = "SELECT * FROM phonebook_table ORDER BY lname";
		$result = $conn -> query($query);
		echo "<table> <tr> <th>First Name</th> <th>Last Name</th> <th>Phone Type</th> <th>Phone Number</th> </tr>";
		while($row = $result->fetch_array(MYSQLI_ASSOC))
		{
			echo "<tr> <td>";
			printf ("%s", $row["fname"]);
			echo "</td>";

			echo "<td>";
			printf ("%s", $row["lname"]);
			echo "</td>";

			echo "<td>";
			printf ("%s", $row["phonetype"]);
			echo "</td>";

			echo "<td>";
			printf ("%s", $row["pnumber"]);
			echo "</td> </tr>";
		}
		echo "</table>";
		$result->close();

		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$fname = $_POST['fname'];
			$lname = $_POST['lname'];
			$phonetype = $_POST['phonetype'];
			$pnumber = $_POST['pnumber'];
			$sql= "INSERT INTO phonebook_table (fname, lname, phonetype, pnumber)VALUES ('$fname', '$lname', '$phonetype', '$pnumber')";
			mysqli_query($conn, $sql);
			$conn->close();
			header("Refresh:0");
		}
		?>
	</main>

</script>
</body>
</html>