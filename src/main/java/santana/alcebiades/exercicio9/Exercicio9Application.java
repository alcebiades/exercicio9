package santana.alcebiades.exercicio9;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio9Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio9Application.class, args);

        /**
         * Desenho da arvore binaria. O valor do nó é o mesmo usando do nome do
         * nó, sendo assim, o nó "n1" tem valor de "1", o "n2" tem valor de "2"
         * e assim por diante. Exemplo: nó "n11" = "11".
         */
//
//                 n1
//                 /\
//                /  \
//               /    \
//              n2      n3
//             /\        /\
//            /  \      /  \
//           /    \    /    \
//          n4    n5   n6    n7
//         /      /\    \      \
//        /      /  \    \      \
//       /      /    \    \      \
//      n8      n9    n10   n11    m12
//
        BinaryTree n12 = new BinaryTree(12);
        BinaryTree n11 = new BinaryTree(11);
        BinaryTree n10 = new BinaryTree(10);
        BinaryTree n9 = new BinaryTree(9);
        BinaryTree n8 = new BinaryTree(8);
        BinaryTree n7 = new BinaryTree(7, null, n12);
        BinaryTree n6 = new BinaryTree(6, null, n11);
        BinaryTree n5 = new BinaryTree(5, n9, n10);
        BinaryTree n4 = new BinaryTree(4, n8, null);
        BinaryTree n3 = new BinaryTree(3, n6, n7);
        BinaryTree n2 = new BinaryTree(2, n4, n5);
        BinaryTree n1 = new BinaryTree(1, n2, n3);

        sum(n1);

        new Scanner(System.in).nextLine();
    }

    private static void sum(final BinaryTree node) {
        System.out.println("\n\n==============================================================");
        System.out.println("Soma da arvore a partir do nó " + node.getValue() + " = " + node.sum());
        System.out.println("==============================================================\n\n");
    }
}
