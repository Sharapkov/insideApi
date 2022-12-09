package model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "text")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Text implements Serializable{

    private static final long serialVersionUID = 5924361831551833717L;
    @Id
    @SequenceGenerator(name = "textIdSeq", sequenceName = "text_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "textIdSeq")
    @Column(name = "textId", updatable = false)
    private Integer textId;

    @Column(name = "message")
    private String message;
}
