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
     * �������� �������.
     *
     * @param args �������� ���������.
     */
    public void div(int... args) {
        if (args.length > 0) {

        } else {

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