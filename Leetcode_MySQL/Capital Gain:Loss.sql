# Write your MySQL query statement below
select s.stock_name,
    SUM(CASE WHEN OPERATION ='Buy' THEN -s.price ELSE s.price END) AS capital_gain_loss
FROM Stocks s
GROUP BY s.stock_name;

/*Write an SQL query to report the Capital gain/loss for each stock.

The Capital gain/loss of a stock is the total gain or loss after buying and selling the stock one or many times.

Return the result table in any order.

The query result format is in the following example.*/