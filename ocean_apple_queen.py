# Python 3 code

# Imports
import os
import sys
import shutil
import random

# Constants
MAX_LINES_IN_FILE = 2000

# Function definitions
def create_file():
	"""
	Creates a new file and prints a message afterwards.
	"""

	# Name the file based on the current date/time
	file_name = 'code_{}.py'.format(datetime.now())

	# Create the file
	with open(file_name, 'w') as f:
		f.write('#!/usr/bin/env python\n\n')

	print('Created new file: {}'.format(file_name))

def append_line_to_file(file_name):
	"""
	Appends a line of code to the selected file.
	"""

	# Generate a random line of code
	line = 'print("Hello World!")\n'

	# Write to the file
	with open(file_name, 'a') as f:
		f.write(line)

def delete_old_files():
	"""
	Deletes any files over MAX_LINES_IN_FILE lines
	"""

	# Get the directory listing
	dir_listing = os.listdir('.')

	# Loop the files
	for fname in dir_listing:
		
		# Check if the file is a Python file
		if fname.endswith('.py'):
			
			# Count the number of lines in the file
			num_lines = len(open(fname).readlines())

			# Check if the file is over MAX_LINES
			if num_lines > MAX_LINES_IN_FILE:
				
				# Delete the file
				os.remove(fname)

# Main program
if __name__ == '__main__':

	# Create a new file
	create_file()

	# Append 2000 lines of code to the file
	filename = os.listdir('.')[0] # Assume the last created file in the directory is the one we want.
	for i in range(MAX_LINES_IN_FILE):
		append_line_to_file(filename)

	# Delete any old files
	delete_old_files()