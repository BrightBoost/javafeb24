# Mini exercises

## Variables
- Create the variables for the following pieces of data and assign them a value:
    - Name
    - Age
    - Phone number
    - Whether or not is nice weather
    - Weight
    - Circumference of the kitchen table
    - First letter of your name
    - The answer to the ultimate question of life, the universe, and everything
    - Storing a number between 0 and 10 on a system with very little memory

## Operators
- Write a program that takes the lengths of the two sides of a right triangle and calculates the length of the hypotenuse.

## Methods
- Write a method that takes a String as an argument and returns the length of the string.
- Write a method that takes a string and an integer as input and returns a string that repeats the input string the input number of times. Example: `multiplyStr("bla", 3)` gives return result `"blablabla"`.
- Write a function that returns the sum of letters in a name, in which each letter corresponds with its position in the alphabet.

## Writing / Reading Console 1
- Write a program that asks that user to enter an article, a noun, and a verb.
- The program then creates a sentence of the form: *article* *noun* *verb*.

## Writing / Reading Console 2
- Ask the user for his/her favorite color.
- Save the result in a variable.
- Ask the user for the first tool that comes to mind.
- Save the result in a variable.
- Print to the console: “combining your input I’m getting a *color* *tool*.”

## Writing / Reading Console 3
- Ask the user for name and highest age (s)he’ll have this year.
- Calculate the year of birth.
- Print to the console: *username* is born in year *year*.

## Conditionals
- Create two numbers: x and y.
- Express each of the following statements using an if block:
    - If x divided by y is 5, then set x to 100.
    - If x times y is 5, then set x to 1.
    - If x is less than y, then double the value of x.
    - If x is greater than y, then increment the value of x by 1.

## Classes
- Create a class `SportPlayer`.
- Give it at least 5 sensible properties, such as name, sport, year they were born, etc.
- Give it 2 sensible methods, one of them should print out the information about the sport player.
- Create three instances of `SportPlayer` and set the fields and call the methods on them.

## Loops 1
- Write a program that asks the user to enter three numbers. The program will then determine and print the largest of the three numbers.
- Create an input validation loop that only accepts numbers in the range of 1 through 10.
- Write a script that asks the user, “Are you sure you want to quit [Y, N]?” The script then checks the user’s input and only accepts the letters Y and N as valid answers.

## Loops 2
- Loop over the letters of a string and print them to the console.

## Loops 3
- Create a list that contains the days of the week.
- Create a list containing the working days of the week.
- Loop over the elements of the first list and print days that are not in the working days.

## Arrays
- Create an array with your favorite movies.
- Create an array with your favorite friends.
- Create an array with your favorite numbers.
- Get the length of each array.
- Create sorted arrays.
- Remove your least favorite one from each array.
- Append an alternative.
- Overwrite the first option with another value.
- From your number array, get the min, max, length, and sum.

## Mini Project: Score Counter
- Write a program that prompts the user to enter five test scores between 1 and 10. The program will then count the number of scores that are greater than 7.  
  (Optional: idea to make it easier and more difficult at the same time: try to use arrays)

## Mini Project: Shop
We have a shop with 4 products and their prices:
- `articles = ["Cheese", "Bread", "Coffee", "Wine"]`
- `prices = [8, 2, 4, 3]`
  Create a program that:
- prints a list of products and asks the user to choose one
- when the user makes a choice, he can enter an amount
- calculate and print the total price for his order

## Mini Project: Collecting Words


Create a while loop for the following:
- Ask the user for a word.
- Store this word in a list (use append).
- Print the list.
- When the user enters nothing, stop the program.
### Deduplication
- Change the program so that, every time the user gives a word, you test whether it is already in the list. If it is, you don't add it.
### Lengths
- Ask the user to enter 4 words. Put those in a list with append.
  After all words have been entered, print:
- The shortest and longest word.
- The average length of all words.

## Mini Project: Guess the Number Game
- Write a game that takes a random integer.
- And makes the user guess that integer until he guesses correctly.
- Show higher or lower to help the user get it right.
### Bonus:
- Keep the number of guesses.
- Collect all the guessed numbers and print them later.
- If someone uses less than 5 guesses, print that (s)he’s awesome.
- Make the program safe for non-numeric input.
- Save this data to a file: guesses, number of guesses, correct number.
### Bonus bonus:
- Write a script that does the guessing, and log the guesses it did.
- Run it 10000 times to get the average number of guesses.
- See if you can optimize the script even further.

## Mini Challenge
- I want to do calculations with a time.
- So if it’s 10.00 and I add 61 minutes, the result should be 11.01.
- Don’t use if or another conditional expression, you don’t need it.

## Mini Challenge
- [Codingame](https://www.codingame.com/home) choose temperatures.

## Mini Challenging Project: Monty Hall Problem
- Monty hall problem:
    - Three doors.
    - Behind one is a big prize that you win when you choose that door.
    - Choose a door.
    - Monty opens one of the others that does not contain the prize.
    - And asks you if you’d like to switch to the other unopened door, or stick with your original choice.
- Use Java to simulate this situation and answer the following question:
    - If you switch doors when Monty gives you the opportunity, do you have a bigger chance of winning?
- Bonus: write results to a file.
