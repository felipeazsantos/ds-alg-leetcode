void main() {

    System.out.println(algo1("arara"));
    System.out.println(algo2("arara"));

}

public boolean algo2(String value) {
    char[] palavra = value.toCharArray();
    int esq = 0;
    int dir = palavra.length - 1;

    while (esq <= dir) {
        if (palavra[esq] != palavra[dir]) {
            return false;
        }
        esq++;
        dir--;
    }

    return true;

}

public boolean algo1(String value) {
    char[] palavra = value.toCharArray();
    char[] invertida = new char[palavra.length];

    int count = 0;
    for (int i = palavra.length -1; i >= 0; i--) {
        invertida[count] = palavra[i];
        count++;
    }

    for (int i = 0; i < palavra.length; i++) {
        if (palavra[i] != invertida[i]) {
            return false;
        }
    }

    return true;
}