class Texi{
    static int number = 0;
    int oil_Amount;
    int now_Speed;
    String destination;
    int distance;
    int destination_Distance;
    int default_Price;
    int distance_Prince;
    String state;

    //생성자
    public Texi(int o_A, int n_S, String des, int dis, int d_D, int def_P, int des_P, String s)
    {
        number++;
        oil_Amount = o_A;
        now_Speed = n_S;
        destination = des;
        distance = dis;
        destination_Distance = d_D;
        default_Price = def_P;
        distance_Prince = des_P;
        state = s;
    }

    //승객 탑승
    public void set_Ride(int n)
    {
        if(state == "일반")
            state = "운행 중";
        else
            return;
    }

    //속도 변경
    public void Minus_speed(int now_speed)
    {
        now_Speed -= now_speed;
    }
    public void Plus_speed(int now_speed)
    {
        now_Speed += now_speed;
    }

    //기름양 Get
    public int oil_chk()
    {
        return oil_Amount;
    }

    //추가요금
    public void add_Acount(int dis, int des)
    {
        if(dis < des)
            distance_Prince += 30000;
    }

    public void Print()
    {
        System.out.println("최종 요금은" + (distance_Prince + default_Price) + "원 입니다.");
    }

}

public class Texi_test {
    public static void main(String args[])
    {
        Texi texi = new Texi(30, 50, "대전", 100, 150, 3000, 150, "일반");

        //운행 시작 전 기름검사
        if(texi.oil_chk() < 10)
            System.out.println("운행 불가");

        //손님 탑승
        texi.set_Ride(1);

        //추가요금
        texi.add_Acount(10, 100);

        //속도 변경
        texi.Minus_speed(10);
        texi.Plus_speed(10);

        //최종요금
        texi.Print();
    }
}
//탑승불가처리