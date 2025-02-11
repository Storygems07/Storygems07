// Program to find the area of a rectangle

// Function to calculate the area
function calculateRectangleArea(length, width) {
  let area = length * width; // Formula for area
  return area;
}

// Example values for rectangle
let length = 5;  // Length of the rectangle
let width = 3;   // Width of the rectangle

// Calling the function for the rectangle
let area = calculateRectangleArea(length, width);

// Displaying the result
console.log("Area of Rectangle: " + area);


// Program to find the maximum and minimum of two numbers

// Function to find maximum and minimum of two numbers
function findMaxAndMin(num1, num2) {
  let max = Math.max(num1, num2);  // Using Math.max() to find the maximum
  let min = Math.min(num1, num2);  // Using Math.min() to find the minimum

  console.log("Maximum number: " + max);
  console.log("Minimum number: " + min);
}

// Example numbers for max/min calculation
let num1 = 10;
let num2 = 5;

// Calling the function for maximum and minimum
findMaxAndMin(num1, num2);
