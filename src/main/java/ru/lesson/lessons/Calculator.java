package ru.lesson.lessons;

public class Calculator {
    /**
     * ��������� ����������.
     */
    private int result;

    /**
     * ��������� ���������.
     *
     * @param params ��������� ������������.
     */
    public void add(int... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * ��������� �������
     *
     * @param args ��������� ���������
     * @throws UserException ���� ���������� ���, ��������� ����������
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
     * �������� ���������.
     *
     * @return ��������� ����������.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * �������� ��������� ����������.
     */
    public void cleanResult() {
        this.result = 0;
    }
}