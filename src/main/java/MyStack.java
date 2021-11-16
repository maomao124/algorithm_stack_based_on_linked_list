import java.util.NoSuchElementException;

/**
 * Project name(项目名称)：算法_基于链表的栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyStack
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 20:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyStack<E>
{

    private Node<E> head;//头结点
    private Node<E> top;//栈顶
    private int size;//栈中元素个数

    public MyStack()
    {
        head = new Node<E>();
        head.next = null;
        top = null;//栈顶初始化为null
        size = 0;
    }

    /**
     * 把item压入栈中
     *
     * @param item
     */
    public void push(E item)
    {
        /********** Begin *********/
        Node<E> node = new Node<>();
        node.item = item;
        node.next = top;
        head.next = node;
        top = node;
        size++;

        /********** End *********/
    }

    /**
     * 返回它栈顶元素并删除
     */
    public E pop()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("栈为空！");
        }
        /********** Begin *********/
        Node<E> node = head;
        E result = top.item;
        node.next = node.next.next;
        top = node.next;
        size--;
        return result;
        /********** End *********/
    }

    /**
     * 返回栈中元素个数
     *
     * @return
     */
    public int size()
    {
        return size;
    }

    /**
     * 判断一个栈是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return (null == head);
    }

    public E getTop()
    {
        return top.item;
    }

    public void display()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("栈为空！");
        }
        E[] array = (E[]) new Object[size];
        Node<E> node = top;
        int i = size-1;
        while (node != null)
        {
            array[i] = node.item;
            node = node.next;
            i--;
        }
        for (int j = 0; j < size; j++)
        {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    //链表结点内部类
    private static class Node<E>
    {
        private E item;
        private Node<E> next;
    }
}
