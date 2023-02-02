package com.hao.d3_Demo;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //�ṩ��װusb�����
    public void install(USB usb){
        usb.connect();

        if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.write();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }

        usb.disconnect();
    }
}
