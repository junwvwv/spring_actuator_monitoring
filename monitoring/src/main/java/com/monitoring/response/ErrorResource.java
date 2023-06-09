package com.monitoring.response;

import com.monitoring.controller.ProductController;
import com.monitoring.model.ExceptionCode;
import lombok.Getter;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Getter
public class ErrorResource extends EntityModel<ErrorResponse> {

    public ErrorResource(ErrorResponse content) {
        super(content);
        add(linkTo(methodOn(ProductController.class).getAllProducts()).withRel("list"));
    }

}
