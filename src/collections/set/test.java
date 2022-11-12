package collections.set;

import java.util.*;

/**
 * @author 叶嘉卫
 * @date 2022/11/10/10:58
 * @Description:
 */
public class test {

        public static void main(String[] args) {
            List<Message> received = List.of(
                    new Message(1, "Hello!"),
                    new Message(2, "发工资了吗？"),
                    new Message(2, "发工资了吗？"),
                    new Message(3, "去哪吃饭？"),
                    new Message(3, "去哪吃饭？"),
                    new Message(4, "Bye")
            );
            List<Message> displayMessages = process(received);
            for (Message message : displayMessages) {
                System.out.println(message.text);
            }
        }

        static List<Message> process(List<Message> received) {
            // TODO: 按sequence去除重复消息
            Set<Message> sets = new TreeSet<>(new Comparator<>() {
                public int compare(Message o1, Message o2) {
                    if (o1.sequence == o2.sequence) {
                        return 0;
                    }
                    return o1.sequence > o2.sequence ? 1 : -1;
                }
            });
           sets.addAll(received);
            return new ArrayList<>(sets);
        }
    }

    class Message {
        public final int sequence;
        public final String text;
        public Message(int sequence, String text) {
            this.sequence = sequence;
            this.text = text;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Message message = (Message) o;
            return sequence == message.sequence ;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sequence);
        }
    }
