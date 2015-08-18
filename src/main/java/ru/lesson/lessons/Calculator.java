package ru.lesson.lessons;

public class Calculator {
    /**
     * Результат вычисления.
     */
    private int result;

    /**
     * Суммируем аргументы.
     *
     * @param params Аргументы суммирования.
     */
    public void add(int... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * Вычисляем деление
     *
     * @param args выходящие аргументы
     * @throws UserException Если аргументов нет, выкидываю исключения
     */
    public void div(int... args) throws UserException {
        if (args.length > 0) {
            this.result = args[0];
            for (int params : args) {
                this.result = params;
            }
        } else {
            throw new UserException("You mast enter args");
        }
    }

    /**
     * Получить результат.
     *
     * @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления.
     */
    public void cleanResult() {
        this.result = 0;
    }
}