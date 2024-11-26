<?php

$xml = simplexml_load_file("products.xml") or die("Error: Cannot create object");

?>
<!DOCTYPE html>
<html>
<head>
    <title>Stationary Shop - XML</title>
</head>
<body>
    <h1>Stationary Shop Inventory</h1>
    <ul>
        <?php
        foreach ($xml->product as $product) {
            echo "<li>" . $product->name . " - ₹" . $product->price . "</li>";
        }
        ?>
    </ul>
</body>
</html>
