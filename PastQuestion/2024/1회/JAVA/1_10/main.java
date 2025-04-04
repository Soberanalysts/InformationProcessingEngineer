
class Parent {
    int x, y;
 
    Parent(int x, int y) { ①
        this.x=x;
        this y=y;
    }
 
    int getT() { ②
        return x*y;
    }
}
 
 63124
 
​class Child extend Parent {
    int x;
 
    Child (int x) { ③
        super(x+1, x);
        this.x=x;
    }
 
    int getT(int n){ ④
        return super.getT()+n;
    }
}
 
 
 
class Main {
    public static void main(String[] args) { ⑤
        Parent parent = new Child(3); ⑥
        System.out.println(parent.getT()); ⑦
    }
}

//실행 순서 : 5 → (6 ) → ( 3) → (1 ) → (2 ) → ( 7)