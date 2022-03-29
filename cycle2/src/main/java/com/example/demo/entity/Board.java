package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
@Entity
@SequenceGenerator(
        name="SEQ_TB_BOARD", //시퀀스 제너레이터 이름
        sequenceName="SEQ_TB_BOARD", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
@Table(name = "tb_board")
public class Board implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "BOARD_SKEY")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_TB_BOARD")
    @SequenceGenerator(name = "SEQ_TB_BOARD", sequenceName = "SEQ_TB_BOARD", allocationSize = 1)
    private Long boardSkey;
    
    @Column(name = "TYPE")
    private String type;
    
    @Column(name = "REPLY_BOARD_SKEY")
    private Long replayBoardSkey;
    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "CONTENT")
    private String content;
    
    @Column(name = "VIEW_CNT")
    private Long viewCnt;
    
    @Column(name = "DELETE_YN")
    private String deleteYn;
    
    @Column(name = "NOTICE_YN")
    private String noticeYn;
    
    @CreatedDate
    @JsonFormat(timezone = "GMT+9", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdDt;
    
    
    @Column(name = "CREATOR")
    private Long creator;

    @CreatedDate
    @JsonFormat(timezone = "GMT+9", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifiedDt;

    @Column(name = "LAST_MODIFIER")
    private Long lastModifier;
}
