class Bus{
    int Max_count;
    int Now_count;
    int price;
    static int number = 0;
    int oil;
    int Now_speed;
    String state;

    //생성자
    public Bus(String s, int M_c, int N_c, int o)
    {
        number++;
        state = s;
        Max_count = M_c;
        Now_count = N_c;
        oil = o;
    }

    //승객 탑승
    public void set_Ride(int n)
    {
        if(Max_count >= Now_count && state == "운행")
            Now_count += n;
        else
            System.out.println("탑승할 수 없어요~");
    }

    //속도 변경
    public void Minus_speed(int now_speed)
    {
        Now_speed -= now_speed;
    }
    public void Plus_speed(int now_speed)
    {
        Now_speed += now_speed;
    }

    //운행상태 변경
    public void change_State(String s)
    {
        state = s;
    }
}

public class Bus_test {
    public static void main(String args[])
    {
        Bus bus = new Bus("운행", 10, 5, 15);

        //속도 변경
        bus.Minus_speed(10);
        bus.Plus_speed(10);

        //손님 탑승
        bus.set_Ride(1);

        //주유랑을 확인해주세요
        if(bus.oil < 10)
        {
            System.out.println("주유량을 확인해 주세요.");
            bus.change_State("차고지행");
        }
    }
}