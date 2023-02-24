function isDiagonalMatrix(matrix) {
    return matrix.every((row, i) => row.every((val, j) => (i === j) || ((i + j) === (matrix.length - 1)) || (val === 0)));
  }
const matrix1 = [
    [0, 0, 1],
    [0, 2, 0],
    [3, 0, 0]];
console.log(isDiagonalMatrix(matrix1)); // true

const matrix3 = [
    [1, 0, 0],
    [0, 2, 0],
    [0, 0, 3]];

    
console.log(isDiagonalMatrix(matrix3)); // true

const matrix2 = [
    [1, 0, 0],
    [0, 2, 3],
    [0, 0, 3]];

    
console.log(isDiagonalMatrix(matrix2)); // false
