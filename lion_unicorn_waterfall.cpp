#include <iostream> 
#include <string> 

int main() 
{ 
    std::string greetingString; 
    std::string userName; 
    std::string userInput; 

    greetingString = "Hello! What is your name?\n"; 
    std::cout << greetingString; 
    std::getline (std::cin, userName); 

    std::cout << "\nNice to meet you, " << userName << "!" << std::endl; 
    std::cout << "\nLet's Learn How to Keep it Clean!\n"; 

    /* Activity Questions */
    std::cout << "Q1) What can we do to conserve our earth's resources?\n"; 
    std::getline (std::cin, userInput); 
    std::cout << "\nA) We can conserve our earth's resources by reducing, reusing, and recycling." << std::endl; 

    std::cout << "\nQ2) How can we reduce the amount of waste we produce?\n"; 
    std::getline (std::cin, userInput); 
    std::cout << "\nA) We can reduce the amount of waste we produce by using less plastic, composting, and reducing food waste.\n"; 

    std::cout << "\nQ3) How can we reuse items?\n"; 
    std::getline (std::cin, userInput); 
    std::cout << "\nA) We can reuse items by using them multiple times, donating them to others, or repurposing them for different uses.\n"; 

    std::cout << "\nQ4) How can we recycle items?\n"; 
    std::getline (std::cin, userInput); 
    std::cout << "\nA) We can recycle items by bringing them to a facility that recycles that type of item, or by participating in a local recycling program.\n"; 

    std::cout << "\nWell done " << userName << "!" << "\nYou have successfully learned how to keep it clean!" << std::endl; 
    
    /* End of Activity Questions */

    std::cout << "\nNow, let's talk about the importance of keeping it clean.\n"; 
    std::cout << "Keeping our environment clean helps us to protect our planet and its resources, and is essential for a healthy and safe future.\n"; 

    std::cout << "\nWe can all help to keep it clean!\n"; 
    std::cout << "Reducing, reusing, and recycling can help us reduce waste, conserve energy and resources, and protect the planet.\n"; 

    std::cout << "\nThank you for learning about how to keep it clean, " << userName << "!" << std::endl;

    return 0;

}