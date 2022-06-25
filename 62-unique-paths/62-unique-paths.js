/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function (m, n) {
  const dp = new Array(m).fill(-1).map(() => new Array(n).fill(-1));

  return helper(m, n, dp);
};

function helper(m, n, dp) {
  if (m === 0 || n === 0) return 0;
  if (m === 1 && n === 1) return 1;

  if (dp[m - 1][n - 1] != -1) return dp[m - 1][n - 1];
  let result = helper(m - 1, n, dp) + helper(m, n - 1, dp);

  return (dp[m - 1][n - 1] = result);
}