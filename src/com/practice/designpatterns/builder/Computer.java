package com.practice.designpatterns.builder;

public class Computer {

    private String HDD;
    private String RAM;
    private Boolean isGraphicCard;
    private Boolean isBluetoothEnable;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public Boolean getGraphicCard() {
        return isGraphicCard;
    }

    public Boolean getBluetoothEnable() {
        return isBluetoothEnable;
    }

    public Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnable= builder.isBluetoothEnable;
        this.isGraphicCard= builder.isGraphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCard=" + isGraphicCard +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }

    public static class ComputerBuilder{
       private String HDD;
       private String RAM;
       private Boolean isGraphicCard;
       private Boolean isBluetoothEnable;

        ComputerBuilder(String HDD, String RAM){
            this.HDD=HDD;
            this.RAM=RAM;
        }

        public ComputerBuilder setGraphicCard(Boolean graphicCard) {
            this.isGraphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setBluetoothEnable(Boolean bluetoothEnable) {
            this.isBluetoothEnable = bluetoothEnable;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer cs= new ComputerBuilder("256GB SSD", "8 GB")
                            .setBluetoothEnable(true)
                            .setGraphicCard(false)
                            .build();


        System.out.println(cs.toString());
    }
}
