import java.awt.*;
import java.util.Scanner;

/**
 * Project name(项目名称)：算法_基于链表的栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 20:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private char ch = 0;
    Scanner input = new Scanner(System.in);
    MyStack<Integer> stack = new MyStack<>();

    public void menu()
    {
        System.out.println("""
                1.进栈
                2.出栈
                3.取栈顶元素
                4.显示全部元素
                5.退出""");
    }

    public void select(test t)
    {
        System.out.print("请选择：");
        ch = input.next().charAt(0);
        if (ch == '1')
        {
            System.out.println("1.进栈:");
            int number;
            //控制台输入变量:number
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:-10000000
                    //max:10000000
                    System.out.print("请输入进栈元素：");
                    number = input.nextInt();
                    if (number >= -10000000 && number <= 10000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[-10000000,10000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            stack.push(number);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '2')
        {
            System.out.println("2.出栈：");

            int result;
            result = stack.pop();
            System.out.println("结果：" + result);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '3')
        {
            System.out.println("3.取栈顶元素");
            int result;
            result = stack.getTop();
            System.out.println("结果：" + result);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '4')
        {
            System.out.println("4.显示全部元素");
            stack.display();
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '5')
        {
            System.out.println("4.退出");
            System.out.println("再见");
            System.exit(1);
        }
        else
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("输入错误！！！自动退出");
            System.exit(0);

        }
    }

    public static void main(String[] args)
    {
        test t = new test();
        if (args.length != 0)
        {
            try
            {
                for (int i = 0; i < args.length; i++)
                {
                    t.stack.push(Integer.parseInt(args[i]));
                }
                System.out.println("已传入初始化参数");
            }
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数传递异常！！！");
                System.out.println("退出");
                System.exit(0);
            }
        }
        t.menu();
        t.select(t);
    }
}
