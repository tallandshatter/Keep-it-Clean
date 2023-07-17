#include <stdio.h>
#include <stdlib.h>

//Defining constants
#define BUFFER_SIZE 1024
#define MAX_INPUT_SIZE 256

//Auxiliary function declarations
int validateInput(char inputArr[]);
void clearBuffer(char buffer[], int size);

int main() {
	//Defining local variables
	char userInput[MAX_INPUT_SIZE];
	char buffer[BUFFER_SIZE];
	int validInput = 0;
	
	//Loop until valid input is returned
	while (!validInput) {
		printf("Please input a valid value: ");
		fgets(userInput, MAX_INPUT_SIZE, stdin);
		
		//Check for input validation
		validInput = validateInput(userInput);
		
		//Clear stdin buffer
		clearBuffer(buffer, BUFFER_SIZE);
	}
	
	//Print out valid input
	printf("You input: %s", userInput);
	
	return 0;
}

//Validate the user input
int validateInput(char inputArr[]) {
	if (strlen(inputArr) > MAX_INPUT_SIZE) {
		printf("Input too long!  Please limit to %d characters.\n", MAX_INPUT_SIZE);
		return 0;
	} else if (strlen(inputArr) == 0) {
		printf("Input empty! Please provide a valid input.\n");
		return 0;
	} else if (inputArr[strlen(inputArr) - 1] != '\n') {
		printf("Input too long! Please limit to %d characters.\n", MAX_INPUT_SIZE);
		return 0;
	}
	
	return 1;
}

//Clear stdin buffer
void clearBuffer(char buffer[], int size) {
	for (int i = 0; i < size; i++) {
		buffer[i] = '\0';
	}
	
	fgets(buffer, BUFFER_SIZE, stdin);
}