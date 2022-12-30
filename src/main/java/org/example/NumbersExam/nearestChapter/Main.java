package org.example.NumbersExam.nearestChapter;

public class Main {

    public static void main(String[] args) {

        Chapter chapter=new Chapter("chapter 1",1);
        Chapter chapter1=new Chapter("chapter 2",15);
        Chapter chapter2=new Chapter("chapter 3",37);

        Chapter[] chapterList={chapter,chapter1,chapter2};

        String result=nearestChapter(chapterList,10);
        System.out.println(result);
    }

    public static String nearestChapter(Chapter[] chapter, int page) {

        int a=0;
        int c=0;
        int d=0;
        int b=Math.abs(chapter[0].getPage()-page);
        for (int i=0;i<chapter.length-1;i++){
            a=Math.abs(chapter[i].getPage()-page);
            d=Math.abs(chapter[i+1].getPage()-page);
            if (b>a){
                b=a;
                c=i;
            }
            if (a==d){
                c=i+1;
            }
        }
        return chapter[c].getName();
    }
}

class  Chapter {
    private String name;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Chapter(String name, int page){
        this.name=name;
        this.page=page;


    }
}