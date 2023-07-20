<?php

// File: keepitclean.php

// Declare the variables required
$errorMessage = null;
$successMessage = null;

// Start session and determine if user is logged in
session_start();
if (isset($_SESSION['loggedIn']) && $_SESSION['loggedIn']) {
    // User is logged in
    // Do whatever functionality necessary for logged-in users
} else {
    // User is not logged in
    // Redirect to login page
    header('Location: login.php');
    exit();
}

// Process any form submissions
if (isset($_POST['submit'])) {
    // Validate form submission
    if ($_POST['field1'] !== '' && $_POST['field2'] !== '') {
        // Form is valid, process it
        $successMessage = "The form was submitted successfully!";
    } else {
        // Form is invalid, display an error message
        $errorMessage = "Please fill out all fields.";
    }
}

?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Keep It Clean</title>
        <style>
            body {
                font-family: sans-serif;
            }
            .error {
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Keep it Clean</h1>
        <?php if ($errorMessage): ?>
            <p class="error"><?php echo $errorMessage; ?></p>
        <?php elseif ($successMessage): ?>
            <p><?php echo $successMessage; ?></p>
        <?php endif; ?>
        <form method="post">
            <label for="field1">Field 1:</label>
            <input type="text" id="field1" name="field1" value="<?php echo (isset($_POST['field1']) ? $_POST['field1'] : ''); ?>">
            <br>
            <label for="field2">Field 2:</label>
            <input type="text" id="field2" name="field2" value="<?php echo (isset($_POST['field2']) ? $_POST['field2'] : ''); ?>">
            <br>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>