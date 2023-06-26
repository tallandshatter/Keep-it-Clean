///////////////// FILE 1 /////////////////
// Global Variables 
let message = "Welcome to my world";
let name = "";
let question = "What is your name?";
let userName = "";
let greeting = "";

// Functions
function askName() {
    name = prompt(question);
    if (name !== null) {
        return name;
    } else {
        alert("Please enter a valid name!");
        return askName();
    }
}

function greetUser() {
    userName = askName();
    greeting = `${message}, ${userName}!`;
    alert(greeting);
}

function sayThanks() {
    alert('Thanks for visiting!');
}

// Main function
function main() {
    greetUser();
    sayThanks();
}

// Run main function
main();

//////////////// FILE 2 /////////////////
// Global Variables 
let animals = [];
let userAnimal = '';

// Functions
function getAnimals() {
    animals = ["dog", "cat", "hamster", "parrot", "stingray"];  // hardcoded array of animals
    return animals;
}

function askAnimal() {
    let question = "What is your favorite pet from the list?";
    userAnimal = prompt(question, animals);
    return userAnimal;
}

function verifyAnimal() {
    for(let i = 0; i < animals.length; i++) {
        if (userAnimal === animals[i]) {
            return true;
        } else {
            alert('Please enter a valid pet!');
            return false;
        }
    }
}

function main() {
    getAnimals();
    askAnimal();
    verifyAnimal();
    alert(`You like ${userAnimal}s - so cool!`);
}

// Run main function
main();