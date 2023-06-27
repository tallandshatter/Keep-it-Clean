// Imports 
use std::io;

fn main() {
    // Variables 
    let mut name = String::new();
    let mut age = String::new();
    let mut cleanliness_min = 0;
    let mut cleanliness_max = 100;
    let mut cleanliness_level = 0;
    let mut feedback = String::new();

    // User Input
    println!("Hello! Please enter your name: ");
    io::stdin()
        .read_line(&mut name)
        .expect("Error getting user input");
    println!("Nice to meet you {}, how old are you?", name);
    io::stdin()
        .read_line(&mut age)
        .expect("Error getting user input");

    // Logic 
    loop {
        println!("Please enter your cleanliness level: ");
        io::stdin()
            .read_line(&mut cleanliness_level)
            .expect("Error getting user input");
        let cleanliness_level: u32 = match cleanliness_level.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        if cleanliness_level <= cleanliness_min {
            println!("Your cleanliness level is too low! Please enter a higher value");
            continue;
        } else if cleanliness_level >= cleanliness_max {
            println!("Your cleanliness level is too high! Please enter a lower value");
            continue;
        } else {
            println!("Thank you for entering a valid cleanliness level!");
            break;
        }
    }

    // User feedback 
    loop {
        println!("Please enter your feedback on our cleanliness program: ");
        io::stdin()
            .read_line(&mut feedback)
            .expect("Error getting user input");
        if feedback.trim().len() < 5 {
            println!("Your feedback is too short! Please enter a longer feedback");
            continue;
        } else {
            println!("Thank you for your feedback!");
            break;
        }
    }
    // Output 
    println!("Thanks for participating in our cleanliness program, {}. You are {} years old and your cleanliness level is {}.", name, age, cleanliness_level);
    println!("We are grateful for your feedback: {}", feedback);
}