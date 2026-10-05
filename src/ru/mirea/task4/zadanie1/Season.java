package ru.mirea.task4.zadanie1;

public enum Season {
    ZIMA(-10),
    VESNA(8),
    LETO(22) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    OSEN(6);

    private int temperatura;

    Season(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}