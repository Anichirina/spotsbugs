package ru.netology.statistic;

public class StatisticsService {


    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income) //noinspection SingleStatementInBlock
            {
                current_max = income;
            }
        return current_max;
    }


    public long findMin(long[] incomesInBillions) {
        long current_min_index = 0;
        long incomes = incomesInBillions[0];
        long current_min = incomesInBillions[0];
        for (long income : incomesInBillions) {
            if (current_min >= income)
            current_min = income;
        }
        return current_min;
    }
}