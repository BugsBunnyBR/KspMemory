	gradle-profiler \
		--benchmark --project-dir "." \
		--scenario-file basic_build.scenario \
		--output-dir "baseline" \
		--iterations 50 \
		--warmups 3
