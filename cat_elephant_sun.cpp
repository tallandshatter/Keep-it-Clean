// Include necessary libraries
#include <iostream>
#include <string>
#include <fstream>

// Declare use of standard library namespace
using namespace std;

// Function prototypes
void processCommandLineArguments(int argc, char* argv[], string &filename);
void clearScreen();
void printLine(const string &input, bool firstLine);
void printFile(string filename);

// Main program
int main(int argc, char* argv[]) 
{
    string filename;
    processCommandLineArguments(argc, argv, filename);
    clearScreen();
    printFile(filename);
    return 0;
}

// Process command line arguments
void processCommandLineArguments(int argc, char* argv[], string &filename) 
{
    if (argc < 2) {
        cout << "Please provide a valid filename.\n";
        exit(EXIT_FAILURE);
    }
    filename = argv[1];
}

// Clear the screen
void clearScreen() 
{
    system("clear");
}

// Print file
void printFile(string filename) 
{
    ifstream inStream;
    inStream.open(filename);
    if (!inStream.is_open()) {
        cout << "Error: cannot open file \"" << filename << "\"\n";
        exit(EXIT_FAILURE);
    }
    string line;
    bool firstLine = true;
    while (getline(inStream, line)) {
        printLine(line, firstLine);
        firstLine = false;
    }
    inStream.close();
}

// Print line
void printLine(const string &input, bool firstLine) 
{
    if (!firstLine) {
        cout << endl;
    }
    cout << input;
}