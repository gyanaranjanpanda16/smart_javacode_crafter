# Java Interview Lab

A structured Java 21 workspace for preparing for product-company interviews: DSA, low-level design (LLD), high-level design (HLD), and interview practice.

**Start here:** [Oct 1–Dec 31 study plan](docs/STUDY_PLAN.md) → [daily assignments](docs/DAILY_PLAN.md) → [progress tracker](docs/PROGRESS.md).

## Modules

| Module | Purpose | Start |
| --- | --- | --- |
| `core` | Existing Java exercises and language fundamentals | [Java checklist](core/README.md) |
| `java-dsa-practice` | Algorithms, complexity, and tested Java solutions | [DSA guide](java-dsa-practice/README.md) |
| `java-lld-practice` | Object modeling, SOLID, patterns, and executable designs | [LLD guide](java-lld-practice/README.md) |
| `java-hld-practice` | Architecture, capacity estimates, and design tradeoffs | [HLD guide](java-hld-practice/README.md) |

HLD is a documentation module (`pom` packaging); it does not pretend to be an executable service. Existing Java sources retain their paths and packages. New code uses lowercase topic packages.

## Run

Install JDK 21+ and Maven 3.9+. The build targets Java 21; CI runs on JDK 21.

```sh
mvn verify
mvn -pl java-dsa-practice -am test
mvn -pl java-lld-practice -am test
mvn -pl java-dsa-practice -Dtest=ArrayMaximumTest test
```

In IntelliJ, open the root `pom.xml`, choose JDK 21 or newer, and reload Maven. If `mvn` is unavailable in your terminal, use IntelliJ's bundled Maven through its Maven tool window. First-time dependency resolution needs network access.

## Daily workflow

Budget 3 hours/day: 90 minutes DSA, 60 minutes LLD/HLD, and 30 minutes review. DSA assumes no prior knowledge: start with variables, conditions, loops and methods on October 1 and finish with an assessment on December 31.

1. Open the next assignment in [DAILY_PLAN](docs/DAILY_PLAN.md); attempt before reading solutions.
2. Write a Java method and tests, explain complexity, and save notes using the [problem template](templates/PROBLEM.md).
3. Spend the design block on the week's LLD or HLD deliverable.
4. Update [PROGRESS](docs/PROGRESS.md) and schedule reviews after 2, 7, and 21 days.
5. Run the module tests before committing.

Use a short-lived branch such as `study/week-01-basics`, then merge after the weekly review. Keep all tracks in this repository; separate long-lived branches would make progress harder to follow.

## What is included

- October 1–December 31, 2026: 92 dated daily assignments, with revision and mocks built in.
- Tested starters: array maximum, longest unique substring, and climbing stairs.
- A tested library-loan LLD example and a worked URL-shortener HLD case study.
- Shared compiler/test versions, JUnit, and GitHub Actions verification.
- [Interview rubric](docs/INTERVIEW_READINESS.md), reusable templates, and [resources](docs/RESOURCES.md).

The curriculum is a suggested learning sequence, not a list of guaranteed Google questions. Interview scope depends on role and level; confirm it with your recruiter. Completing the tracker means completing practice, not a hiring guarantee.
