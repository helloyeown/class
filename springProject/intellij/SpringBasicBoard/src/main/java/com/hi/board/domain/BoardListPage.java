package com.hi.board.domain;

import java.util.List;

public class BoardListPage {

    // 페이지당 출력할 게시물의 갯수
    private int countPerPage;
    // 현재 페이지 번호
    private int pageNum;
    // 게시물의 리스트 List<BoardDTO>
    private List<BoardDTO> list;
    // 전체 게시물의 갯수
    private int totalCount;

    // 페이징 시작 번호
    private int startNum;
    // 페이징 끝 번호
    private int endNum;
    // 이전 버튼 출력 여부
    private boolean prev;
    // 다음 버튼 출력 여부
    private boolean next;

    public BoardListPage(int countPerPage, int pageNum, List<BoardDTO> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }


    private void calPageInfo(){
        // 끝번호
        this.endNum = (int)(Math.ceil((this.pageNum*1.0/10)))*10;
        // Math.ceil 무조건 올림 연산

        // 시작 번호
        this.startNum = this.endNum-9;

        // 실제 끝번호: 전체 페이지 중 끝번호
        int realEndNum = (int)(Math.ceil(this.totalCount * 1.0 / countPerPage));

        // endNum
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        // 이전 버튼 유무
        this.prev = this.startNum > 1;

        // 다음 버튼 유무: 현재 구간의 마지막 번호 < realEndNum
        this.next = this.endNum < realEndNum;

    }

}
