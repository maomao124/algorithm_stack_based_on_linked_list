import java.util.Scanner;

/**
 * Project name(项目名称)：算法_基于链表的栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyStackTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 20:16
 * Version(版本): 1.0
 * Description(描述)：
 * 测试输入：to be or not to - be - - that - - - is
 * 预期输出：to be not that or be
 */

public class MyStackTest
{
    public static void main(String[] args)
    {
        MyStack<String> s = new MyStack<>();
        /*
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String str = in.next();
            if (!str.equals("-"))
            {
                s.push(str);
            }
            else
            {
                System.out.print(s.pop() + " ");
            }
        }
         */
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
