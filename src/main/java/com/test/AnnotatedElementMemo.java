package com.test;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"test1Value","test2Value"},params = "testParam",headers = "testHeader")
public class AnnotatedElementMemo {
}
