	gradle-profiler \
		--benchmark --project-dir "." \
		--scenario-file basic_build.scenario \
		--output-dir "ksp" \
		--iterations 50 \
		--warmups 3
