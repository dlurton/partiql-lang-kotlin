package org.partiql.examples

import org.partiql.examples.util.Example
import java.io.PrintStream

class ParserExampleTest : BaseExampleTest() {
    override fun example(out: PrintStream): Example = ParserExample(out)

    override val expected = """
        |PartiQL query
        |    SELECT exampleField FROM exampleTable WHERE anotherField > 10
        |Serialized AST
        |    
        |    (
        |      ast
        |      (
        |        version
        |        1
        |      )
        |      (
        |        root
        |        (
        |          term
        |          (
        |            exp
        |            (
        |              select
        |              (
        |                project
        |                (
        |                  list
        |                  (
        |                    term
        |                    (
        |                      exp
        |                      (
        |                        id
        |                        exampleField
        |                        case_insensitive
        |                      )
        |                    )
        |                    (
        |                      meta
        |                      (
        |                        ${'$'}source_location
        |                        (
        |                          {
        |                            line_num:1,
        |                            char_offset:8
        |                          }
        |                        )
        |                      )
        |                    )
        |                  )
        |                )
        |              )
        |              (
        |                from
        |                (
        |                  term
        |                  (
        |                    exp
        |                    (
        |                      id
        |                      exampleTable
        |                      case_insensitive
        |                    )
        |                  )
        |                  (
        |                    meta
        |                    (
        |                      ${'$'}source_location
        |                      (
        |                        {
        |                          line_num:1,
        |                          char_offset:26
        |                        }
        |                      )
        |                    )
        |                  )
        |                )
        |              )
        |              (
        |                where
        |                (
        |                  term
        |                  (
        |                    exp
        |                    (
        |                      >
        |                      (
        |                        term
        |                        (
        |                          exp
        |                          (
        |                            id
        |                            anotherField
        |                            case_insensitive
        |                          )
        |                        )
        |                        (
        |                          meta
        |                          (
        |                            ${'$'}source_location
        |                            (
        |                              {
        |                                line_num:1,
        |                                char_offset:45
        |                              }
        |                            )
        |                          )
        |                        )
        |                      )
        |                      (
        |                        term
        |                        (
        |                          exp
        |                          (
        |                            lit
        |                            10
        |                          )
        |                        )
        |                        (
        |                          meta
        |                          (
        |                            ${'$'}source_location
        |                            (
        |                              {
        |                                line_num:1,
        |                                char_offset:60
        |                              }
        |                            )
        |                          )
        |                        )
        |                      )
        |                    )
        |                  )
        |                  (
        |                    meta
        |                    (
        |                      ${'$'}source_location
        |                      (
        |                        {
        |                          line_num:1,
        |                          char_offset:58
        |                        }
        |                      )
        |                    )
        |                  )
        |                )
        |              )
        |            )
        |          )
        |        )
        |      )
        |    )
        |
    """.trimMargin()
}