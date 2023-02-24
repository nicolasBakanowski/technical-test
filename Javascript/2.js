//2. Given the following data array:
// ["Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon",
// "Pineapple", "Peach", "Peach"];
// ● Get all strings containing the letter 'p'.
// ● Obtain the ‘Grape’ string.

const array = ["Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon",
"Pineapple", "Peach", "Peach"];

const containingP = array.filter(element => element.includes('p'));

console.log(containingP);

const grape = array.find(element => element === 'Grape');

console.log(grape);