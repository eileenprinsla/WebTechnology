<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "stationary_shop";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


$sql = "SELECT product_name, price FROM products";
$result = $conn->query($sql);

?>
<!DOCTYPE html>
<html>
<head>
    <title>Stationary Shop</title>
</head>
<body>
    <h1>Stationary Shop Products</h1>
    <?php
    if ($result->num_rows > 0) {
        echo "<ul>";
        while ($row = $result->fetch_assoc()) {
            echo "<li>" . $row["product_name"] . " - ₹" . $row["price"] . "</li>";
        }
        echo "</ul>";
    } else {
        echo "<p>No products available.</p>";
    }

    $conn->close();
    ?>
</body>
</html>
