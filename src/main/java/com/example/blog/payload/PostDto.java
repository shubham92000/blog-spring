package com.example.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Schema(
        description = "post dto model info"
)
@Data
public class PostDto {
    private long id;

    @Schema(
            description = "blog post title"
    )
    @NotEmpty
    @Size(min = 2, message = "post title should have at least 2 characters")
    private String title;

    @Schema(
            description = "blog post description"
    )
    @NotEmpty
    @Size(min = 10, message = "post description should have at least 10 characters")
    private String description;

    @Schema(
            description = "blog post content"
    )
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "post category"
    )
    private Long categoryId;
}
