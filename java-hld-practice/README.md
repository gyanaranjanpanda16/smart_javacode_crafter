# High-level design

**Active schedule:** [October 1–December 31, 2026](../docs/DAILY_PLAN.md). Follow the dated assignments; additional topics in this guide are optional reference material.

This documentation-only Maven module holds architecture exercises. Start with fundamentals, then complete one case study at a time using the [HLD template](../templates/HLD.md).

## Foundation checklist

- [ ] Requirements, SLOs, peak QPS, storage and bandwidth estimates.
- [ ] HTTP, DNS, load balancing, caches and CDN behavior.
- [ ] Relational vs key/value data models, indexes, transactions.
- [ ] Replication, partitioning, consistency and availability during failures.
- [ ] Queues, retries, idempotency, outbox and backpressure.
- [ ] Authentication/authorization, abuse controls, observability and cost.

## Case sequence

1. [URL shortener — worked example](cases/url-shortener.md)
2. Notification service: preferences, fan-out, retries, dead-letter queue.
3. Distributed rate limiter: token bucket, atomic updates, regional limits.
4. News feed: push/pull fan-out, ranking, hot accounts.
5. Chat: ordering scope, offline delivery, reconnect and presence.
6. File storage: metadata, multipart uploads, durability and permissions.
7. Autocomplete: prefix index, ranking and update freshness.
8. Metrics ingestion: batching, aggregation, retention and cardinality.
9. Ticket booking: holds, races, payment completion and expiry.
10. Payments: deduplication, ledger consistency and reconciliation.

These are assignments, not completed implementations. Each case must include a capacity calculation, API, schema, diagram, bottleneck, failure analysis, and at least two alternatives with reasons for your choice.

For a 45-minute mock: 5 min clarify, 5 min estimate, 10 min overall design, 15 min deep dive, 5 min failures, 5 min tradeoffs. Never begin by choosing Kafka or microservices before understanding requirements.
